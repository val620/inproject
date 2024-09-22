package com.example.demo99;

import com.example.demo99.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class Demo99Application {

    public static void main(String[] args) {

        var text="aabcccbbad";
        StringUtils.removeOrReplaceString(text,false);

        text="abcccbad";
        StringUtils.removeOrReplaceString(text,true);

        SpringApplication.run(Demo99Application.class, args);
    }



}
