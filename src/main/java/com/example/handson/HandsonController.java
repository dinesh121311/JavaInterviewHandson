package com.example.handson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HandsonController {
            public static String reverse(String str) {
                if (str == null || str.isEmpty()) {
                    return str;
                }
                StringBuilder reversed = new StringBuilder(str);
                return reversed.reverse().toString();
            }

            public static void main(String[] args) {
                String str = "Hello, World!";
                System.out.println("Reversed: " + reverse(str));
            }
        }

