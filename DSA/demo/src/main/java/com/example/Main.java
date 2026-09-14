package com.example;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Fortnite");
        stack.push("Valorant");

        stack.pop();
        stack.pop();

        System.out.println(stack);

        int[] lastSeen = new int[128];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, lastSeen[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen[currentChar] = right + 1;
        }

        sy
    }
}