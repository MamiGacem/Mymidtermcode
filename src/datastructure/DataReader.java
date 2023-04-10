package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {
         	public static void main(String[] args) throws IOException {

				/*
				 * User API to read the below textFile and print to console.
				 * Use BufferedReader class.
				 * Use try....catch block to handle Exception.
				 *
				 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
				 *
				 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
				 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
				 * order from LinkedList and retrieve as FILO order from Stack.
				 *
				 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
				 * Use For Each loop/while loop/Iterator to retrieve data.
				 */



// use bufferreader class, init bufferreader and filereader

// along with required variables

// given textfile
				FileReader fr = null;
				try {
					fr = new FileReader("C:\\Users\\Amel Boucetta Gacem\\eclipse-workspace\\midterm-coding-exam\\src\\data\\self-driving-car");
				} catch (FileNotFoundException e) {
					throw new RuntimeException(e);
				}

				BufferedReader br = new BufferedReader(fr);// br is a virtual copy
// we put the fr because the buffer reader read from the filereader
				String line = null; // before assign in this it shows the file missed from somes lines

				try {
					while ((line = br.readLine()) != null) { // to read the whole file
						System.out.println(line); // method to read one line  fro my file
					}// in this loop it check in every line if it empty or not and then print it
				} catch (IOException e) {
					throw new RuntimeException(e);

					// what the difference between final,finilize and finlly
// final can have power on variable that you cannot reassign ,it can have power on class (final class cannot be inherited )and methof(final method cannot be ovveriding)
					// finally is associated to try &catch bloc that is excuted anyways
				}finally{ // bloc associated to try and catch
					try {
						fr.close();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
					try {
						br.close();
					} catch (IOException e) {
						throw new RuntimeException(e);
						// finalize is a method that is belongs to java that is used during the garbej collection
					}
				}

					String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

					FileReader filereader = null;

					BufferedReader bufferreader = null;

				//	String line;

					String store = "";

					try {

// read file as specified in question using FileReader

						filereader = new FileReader(textFile);

					} catch (FileNotFoundException e) {

// handle file not found

						e.printStackTrace();

					}

					try {

// using buffer reader api

						bufferreader = new BufferedReader(filereader);

						while ((line = bufferreader.readLine()) != null) {

// extract each line

							store += line;

						}

					} catch (Exception e) {

// handle exception

						System.out.println("Error unable to read");

					}

// store each word from complete text in storeArray

					String[] storeArray = store.split(" ");

// empty stack and list

					Stack<String> stack = new Stack<String>();

					LinkedList<String> list = new LinkedList<String>();

// store each word to stack and list

					for (String element : storeArray) {

// as specified in question stack add, push to add element

						list.add(element);

						stack.push(element);

					}

// retrieve FIFO order form linked list

					System.out.println("LinkedList FIFO : ");

					System.out.print (list.remove() + " ");

					while (!list.isEmpty())

						System.out.print (list.remove() + " ");

					System.out.println();

// since stack if LIFO

					System.out.println("Stack FILO : ");

				while (!stack.isEmpty()) {

						System.out.print(stack.pop() + " ");

					}

// formatted output
				System.out.println();

				}

			}