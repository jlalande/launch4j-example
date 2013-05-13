package com.jlalande.example.launch4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    System.out.println("Hello World!");

    System.out.print("Press any key to continue...");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    in.readLine();
  }

}
