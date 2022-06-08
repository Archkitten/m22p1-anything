package com.nitrocode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class typingController {
    @GetMapping("/gettext")
    @ResponseBody
    public String type(Model model) {
        String[] texts = {"public class Main {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Hello World\");\n\t}\n}",
                "if (20 > 18) {\n\tSystem.out.println(\"20 is greater than 18\");\n}",
                "for (int i = 0; i < 5; i++) {\n\tSystem.out.println(i);\n}",
                "int i = 0;\nwhile (i < 5) {\n\tSystem.out.println(i);\n\ti++;\n}",
                "int i = 0;\ndo {\n\tSystem.out.println(i);\n\ti++;\n} while (i < 5);",
                "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\ncars[0] = \"Opel\";\nSystem.out.println(cars[0]);\nSystem.out.println(cars.length);"};
        int randomNumber = (int)(Math.random() * texts.length);

        return texts[randomNumber];
    }

    @GetMapping("/typing")
    public String typing() {
        return "typing";
    }
}
