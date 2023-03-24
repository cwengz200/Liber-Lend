package domain;
/**
        * Branch.java
        * Class to Test Branch
        * Author: Cwenga Dlova(214310671)
        * Date: 19 March 2023
        */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {
    @Test

    public void testBranch(){
        Branch branch1 = new Branch.Builder().setName("Cape Town").setCode(7150).setEmailAddress("cptlibrary@wc.co.za").setAddress("28 Loop Street").setAvailableItems("Magazines").build();
        Branch branch2 = new Branch.Builder().setName("Khayelitsha").setCode(8020).setEmailAddress("kltlibrary@wc.co.za").setAddress("8467 Umgwali Street").setAvailableItems("Novels").build();
        System.out.println(branch2.equals(branch1));

    }


}