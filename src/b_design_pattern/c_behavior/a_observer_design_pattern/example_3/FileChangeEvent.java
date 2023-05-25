package b_design_pattern.c_behavior.a_observer_design_pattern.example_3;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

public class FileChangeEvent {
    private final Path path;
    private final WatchEvent.Kind<?>  kind;

    public FileChangeEvent(Path path, WatchEvent.Kind<?> kind) {
        this.path = path;
        this.kind = kind;
    }

    public Path getPath() {
        return path;
    }

    public WatchEvent.Kind<?> getKind() {
        return kind;
    }
}