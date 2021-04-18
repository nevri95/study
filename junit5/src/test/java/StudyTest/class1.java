package StudyTest;


import StudyTest.testnethod.Calculating;
import com.asserttest.util.Calculat;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;

import java.io.File;

/**
 * @author Nevri on 2021/4/10
 * @Title:
 * @Description:
 */
public class class1   {

@RepeatedTest(10)
    public  void sysout() throws InterruptedException {
    Calculat.count(1);
//    Calculat.add(2,3);
}
}
