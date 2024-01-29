package com.example.demo.main;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

/**
 * @author: Arlin
 * @date: 2024/1/29
 * @description:
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("file.txt", "r");
             FileChannel fileChannel = randomAccessFile.getChannel()) {

            // Create a ByteBuffer to read data from the file
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());

            // Read data into the ByteBuffer from the FileChannel
            fileChannel.read(buffer);

            // Set the position to the beginning of the buffer for reading
            buffer.flip();

            // Decode bytes from the buffer using the desired character encoding
            Charset charset = StandardCharsets.UTF_8;
            CharsetDecoder decoder = charset.newDecoder();
            String content = decoder.decode(buffer).toString();

            // Use the content read from the file
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
