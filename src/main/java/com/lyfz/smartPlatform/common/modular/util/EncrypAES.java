package com.lyfz.smartPlatform.common.modular.util;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncrypAES {

    /**
     * @method main
     * @param args
     * @throws
     * @since v1.0
     */
    private static String PASSWORD = "AES_LYFZ";

    public static void main(String[] args) {
        String content = "宋建勇";
        String encryptResult = encrypt(content);//加密
        System.out.println("解密密后：" + encryptResult);
        String decryptResult = decrypt(encryptResult);//解密
        System.out.println("解密后：" + decryptResult);
    }

    /**
     * 加密
     * @method encrypt
     * @param content   需要加密的内容
     * @return
     * @throws
     * @since v1.0
     */
    public static String encrypt(String content){
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, new SecureRandom(PASSWORD.getBytes()));
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] encryptResult = cipher.doFinal(byteContent);

            String result = parseByte2HexStr(encryptResult);

            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (InvalidKeyException e) {
            e.printStackTrace();
        }catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     * @method decrypt
     * @param content   待解密内容
     * @return
     * @throws
     * @since v1.0
     */
    public static String decrypt(String content){
        byte[] decryptFrom = parseHexStr2Byte(content);
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, new SecureRandom(PASSWORD.getBytes()));
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");/* 创建密码器 */
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] decryptResult = cipher.doFinal(decryptFrom);
            String result = new String(decryptResult);
            return result; // 解密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }catch (InvalidKeyException e) {
            e.printStackTrace();
        }catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }catch (BadPaddingException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 将二进制转换成16进制
     * @method parseByte2HexStr
     * @param buf
     * @return
     * @throws
     * @since v1.0
     */
    public static String parseByte2HexStr(byte buf[]){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < buf.length; i++){
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     * @method parseHexStr2Byte
     * @param hexStr
     * @return
     * @throws
     * @since v1.0
     */
    public static byte[] parseHexStr2Byte(String hexStr){
        if(hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


}
