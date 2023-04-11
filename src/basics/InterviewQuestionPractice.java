package basics;

public class InterviewQuestionPractice {

	public static void main(String[] args) {
		
		// you are given a string, take the first and last char of each word and return
				// the moified string
				// this sample string is given to a method
				// ts se sg is gn to a md

				String input = "this sample string is given to a method";
				System.out.println(processString(input));

			}

			public static String processString(String str) {
				String res = "Result: ";
				String[] words = str.split(" ");
				for (String s : words) {
					if (s.length() > 1) {
						res += s.charAt(0) + "" + s.charAt(s.length() - 1) + " ";
					} else {
						res += s.charAt(0) + " ";
					}

				}
				return res;
			}

		}