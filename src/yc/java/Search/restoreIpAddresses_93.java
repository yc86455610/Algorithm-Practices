package yc.java.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Algorithm-Practices
 * @description: ip地址划分
 * @author: yc
 * @create: 2019-11-28 19:59
 *
 * Given "25525511135",
 * return ["255.255.11.135", "255.255.111.35"].
 **/


public class restoreIpAddresses_93 {
    public List<String> restoreIpAddresses(String s ) {
        List<String> addresses = new ArrayList<>();
        StringBuilder tempAddress = new StringBuilder();
        doRestore(0,tempAddress,addresses,s);
        return addresses;
    }

    private void doRestore(int k, StringBuilder tempAddress,List<String> addresses,String s ) {
        if(k==4||s.length()==0){

        }
    }
}
