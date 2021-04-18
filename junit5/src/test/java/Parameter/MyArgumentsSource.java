package Parameter;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

/**
 * @author Nevri on 2021/3/30
 * @Title:
 * @Description:
 */
public class MyArgumentsSource implements ArgumentsProvider {

    @Override
    public  Stream<? extends Arguments>  provideArguments(ExtensionContext context) {
        return Stream.of("foo", "bar").map(Arguments::of);
    }


}
