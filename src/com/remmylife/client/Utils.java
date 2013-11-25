package com.remmylife.client;

import java.io.*;

import javax.activation.DataHandler;

public class Utils {
	public static Object convertToObject(byte[] bytes) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
		ObjectInputStream objectInputStream;
		Object object = null;
		try {
			objectInputStream = new ObjectInputStream(byteArrayInputStream); 
			object = objectInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
	public static byte[] convertToByteArray(Object object) {
		ObjectOutputStream objectOutputStream = null;
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream(4096);
		try {
			objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(byteStream));
			objectOutputStream.flush();
			objectOutputStream.writeObject(object);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] bytes = byteStream.toByteArray();
		return bytes;
	}
	
	public static byte[] dataHandlerToBytes(DataHandler handler) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
        handler.writeTo(output);
        return output.toByteArray();
    }
}
