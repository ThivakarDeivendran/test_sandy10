package org.javaprogram;
//
//public class Variables {
//	
//	public static void main(String[] args)
//	{
//		int N = A.length;
//        int maxSum = 0;
//        
//        for (int i = 0; i < N - 1; i++) {
//            int sum1 = maxSumTwoTiles(A, 0, i);
//            int sum2 = maxSumTwoTiles(A, i + 1, N - 1);
//            int sum3 = maxSumThreeTiles(A, 0, i, i + 1, N - 1);
//            int totalSum = sum1 + sum2 + sum3;
//            
//            maxSum = Math.max(maxSum, totalSum);
//        }
//        
//        return maxSum;
//    }
//    
//    private int maxSumTwoTiles(int[] A, int start, int end) {
//        int N = end - start + 1;
//        int[] dp = new int[N];
//        dp[0] = A[start];
//        dp[1] = Math.max(A[start], A[start + 1]);
//        
//        for (int i = 2; i < N; i++) {
//            dp[i] = Math.max(dp[i - 1], dp[i - 2] + A[start + i]);
//        }
//        
//        return dp[N - 1];
//    }
//    
//    private int maxSumThreeTiles(int[] A, int start1, int end1, int start2, int end2) {
//        int sum1 = maxSumTwoTiles(A, start1, end1);
//        int sum2 = maxSumTwoTiles(A, start2, end2);
//        
//        return sum1 + sum2;
//		
//	}
//
//}
import java.io.*;
import java.util.*;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Variables {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Alice");
//        list.add(Boolean.TRUE.toString());
//        list.add("Bob");
//
//        System.out.println(list);
//    }
	
	
//	public class Main {
//	    public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        List<Integer> input = new ArrayList<>();
//
//	        String[] inputItems = bufferedReader.readLine().split(",");
//	        for (String inputItem : inputItems) {
//	            int number = Integer.parseInt(inputItem.trim());
//	            input.add(number);
//	        }
//
//	        int outcome = getSmallestPositiveInteger(input);
//	        System.out.println(outcome);
//
//	        bufferedReader.close();
//	    }
//
//	    public static int getSmallestPositiveInteger(List<Integer> input) {
//	        Set<Integer> positiveSet = new HashSet<>();
//
//	        for (int num : input) {
//	            if (num > 0) {
//	                positiveSet.add(num);
//	            }
//	        }
//
//	        int smallestPositive = 1;
//	        while (positiveSet.contains(smallestPositive)) {
//	            smallestPositive++;
//	        }
//
//	        return smallestPositive;
//	    }
//	
	
	
	


	//public class Main {
//	    public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        String S = bufferedReader.readLine();
//
//	        int outcome = solution(S);
//	        System.out.println(outcome);
//
//	        bufferedReader.close();
//	    }
//
//	    public static int solution(String S) {
//	        int maxSymmetricLength = 0;
//	        int questionCount = 0;
//	        int openCount = 0;
//
//	        for (char c : S.toCharArray()) {
//	            if (c == '<') {
//	                if (questionCount > 0) {
//	                    openCount++;
//	                    questionCount--;
//	                } else {
//	                    openCount++;
//	                }
//	            } else if (c == '>') {
//	                if (questionCount > 0) {
//	                    openCount--;
//	                    questionCount--;
//	                } else {
//	                    openCount--;
//	                }
//	            } else if (c == '?') {
//	                questionCount++;
//	            }
//
//	            if (questionCount >= Math.abs(openCount)) {
//	                maxSymmetricLength = Math.max(maxSymmetricLength, 2 * Math.abs(openCount));
//	            }
//	        }
//
//	        return maxSymmetricLength;
//	    }
	
	
	
	

	//public class Main {
//	    public static void main(String[] args) throws IOException {
//	    	
//	    	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	    	        String input = bufferedReader.readLine();
//
//	    	        String[] inputItems = input.split(",");
//	    	        int a = Integer.parseInt(inputItems[0].trim());
//	    	        int b = Integer.parseInt(inputItems[1].trim());
//
//	    	        String outcome = getString(a, b);
//	    	        System.out.println(outcome);
//
//	    	        bufferedReader.close();
//	    	    }
//
//	    public static String getString(int a, int b) {
//	        StringBuilder stringBuilder = new StringBuilder();
//	        char prevChar = ' ';
//	        int countA = 0;
//	        int countB = 0;
//
//	        while (countA < a || countB < b) {
//	            if (a > b && countA < a) {
//	                stringBuilder.append("a");
//	                countA++;
//	                prevChar = 'a';
//	            } else if (b > a && countB < b) {
//	                stringBuilder.append("b");
//	                countB++;
//	                prevChar = 'b';
//	            } else {
//	                if (prevChar == 'a') {
//	                    stringBuilder.append("b");
//	                    countB++;
//	                    prevChar = 'b';
//	                } else {
//	                    stringBuilder.append("a");
//	                    countA++;
//	                    prevChar = 'a';
//	                }
//	            }
//	        }
//
//	        return stringBuilder.toString();
//	    }
//	

	



	    static List<Employee> removeDuplicates(List<Employee> employees) {
	        // Using a LinkedHashMap to maintain insertion order and ensure uniqueness based on employeeId
	        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
	        
	        for (Employee emp : employees) {
	            employeeMap.putIfAbsent(emp.employeeId, emp);
	        }
	        
	        return new ArrayList<>(employeeMap.values());
	    }

	    static class Employee {
	        Integer employeeId;
	        String employeeName;
	        String department;

	        public Employee(Integer employeeId, String employeeName, String department) {
	            this.employeeId = employeeId;
	            this.employeeName = employeeName;
	            this.department = department;
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);

	        int n = Integer.parseInt(br.readLine().trim());

	        List<Employee> employees = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            String[] employeeDetails = br.readLine().split(" ");
	            Employee e = new Employee(Integer.valueOf(employeeDetails[0]), employeeDetails[1], employeeDetails[2]);
	            employees.add(e);
	        }

	        List<Employee> out_ = removeDuplicates(employees);
	        for (int i = 0; i < out_.size(); i++) {
	            System.out.print(out_.get(i).employeeId);
	            System.out.print(" ");
	            System.out.print(out_.get(i).employeeName);
	            System.out.print(" ");
	            System.out.print(out_.get(i).department);
	            System.out.println("");
	        }

	        wr.close();
	        br.close();
	    }
	}



