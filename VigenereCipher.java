package com.example;

public class VigenereCipher {

	public static void main(String[] args) {
		
	String key = "VIGENERECIPHER";
    String ori = "My Name is Nikhil Goyal.I lives in NOida.";
    String enc = new VigenereCipher().encrypt(ori, key);
    System.out.println(enc);
    System.out.println(new VigenereCipher().decrypt(enc, key));

	}
	public String decrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
	
	public String encrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
}
