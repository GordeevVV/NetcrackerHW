package com.company;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    @Test
    public void IsPali_Correct_Input(){
        IsPali pl=new IsPali();
        Assertions.assertEquals(pl.isPalindrome(12321),pl.isPalindrome(-12321));
    }
    @Test
    public void IsPali_Correct_false() {
        IsPali pl=new IsPali();
        Assertions.assertFalse(pl.isPalindrome(123121));
    }
    @Test
    public void IsPali_Correct_true() {
        IsPali pl=new IsPali();
        Assertions.assertTrue(pl.isPalindrome(7437347));
    }
}
