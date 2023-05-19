package b_design_pattern.a_create.d_prototype_design_pattern;

/**
 * @author liwencai
 * @since 2023/5/19
 */
public class SearchWord {
    private String keyword;
    private Long count;
    private Long lastUpdateTime;

    public SearchWord(String keyword, Long count, Long lastUpdateTime) {
        this.keyword = keyword;
        this.count = count;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
