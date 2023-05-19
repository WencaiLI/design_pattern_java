package b_design_pattern.a_create.d_prototype_design_pattern.example_2;

import b_design_pattern.a_create.d_prototype_design_pattern.SearchWord;

import java.io.*;
import java.util.HashMap;
import java.util.List;

/**
 * 第二种方式：通过序列化后再反序列化实现深拷贝
 * 在可以优化的地方是对需要拷贝的数据进行分类，只对需要新增的数据和需要更新的数据进行操作，这样就能减少对象的创建。
 * @author liwencai
 * @since 2023/5/19
 */
@SuppressWarnings("all")
public class Demo {
  private HashMap<String, SearchWord> currentKeywords=new HashMap<>();
  private long lastUpdateTime = -1;

  public void refresh() throws IOException, ClassNotFoundException {
    // Deep copy
    // HashMap<String, SearchWord> newKeywords = new HashMap<>();
    HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) deepCopy(currentKeywords);
    // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
    List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
    long maxNewUpdatedTime = lastUpdateTime;
    for (SearchWord searchWord : toBeUpdatedSearchWords) {
      if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
        maxNewUpdatedTime = searchWord.getLastUpdateTime();
      }
      if (newKeywords.containsKey(searchWord.getKeyword())) {
        SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyword());
        oldSearchWord.setCount(searchWord.getCount());
        oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
      } else {
        newKeywords.put(searchWord.getKeyword(), searchWord);
      }
    }

    lastUpdateTime = maxNewUpdatedTime;
    currentKeywords = newKeywords;
  }

  private List<SearchWord> getSearchWords(long lastUpdateTime) {
    // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
    return null;
  }



  public Object deepCopy(Object obj){
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    ObjectOutputStream oo = null;
    ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
    try {
      oo = new ObjectOutputStream(bo);
      oo.writeObject(obj);
      ObjectInputStream oi = new ObjectInputStream(bi);
      return oi.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}