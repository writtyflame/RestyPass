package df.open.restypass.spring.pojo;

import lombok.Data;

/**
 * @PathVariable content
 * Created by darrenfu on 17-7-27.
 */
@Data
public class PathVariableData {
    private Integer index;
    private String name;
    private boolean required;
}
