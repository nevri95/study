package suite;

import com.junit5Test.junit5Test2.Junit5Demo1Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */

@RunWith(JUnitPlatform.class)
//@SelectPackages({ "com.junit5Test.junit5Test1","com.junit5Test.junit5Test2"})
//@IncludePackages({"com.junit5Test.junit5Test2"})
//@ExcludePackages({"com.junit5Test.junit5Test2"})
@SelectClasses({Junit5Demo1Test.class})
@IncludeTags("group1")
public class suite {

}
