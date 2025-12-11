package com;

import com.file.system.File;
import com.file.system.Folder;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("/");
        root.addChild(new File("root"));
        root.addChild(new File("lib"));
        root.addChild(new Folder("dev"));
        Folder src = (Folder) root.addChild(new Folder("src"));
        src.addChild(new File("src1"));
        src.addChild(new File("src2"));
        src.addChild(new File("src3"));
        root.print();
    }
}