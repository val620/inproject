package com.example.demo99;

//import org.junit.Test;
import com.example.demo99.utils.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo99ApplicationTests {

    @Test
    public void test1() {
        System.out.println("test...");
    }

    @ParameterizedTest
    @ValueSource(strings={"","aabcccbbad","baaabbc","aaa","aaab","aaabccc","abbbccc","ab"})
    public void removeTest(String input) {
        StringUtils.removeOrReplaceString(input,false);
    }

    @ParameterizedTest
    @ValueSource(strings={"","abcccbad","baaabbc","aaa","aaab","aaabccc","abbbccc","ab"})
    public void replaceTest(String input) {
        StringUtils.removeOrReplaceString(input,true);
    }

}
