//package playground;
//
//import java.io.*;
//import java.util.*;
//
//
//public class PractiseSignal {
//
//    public static String solutionInDirectory(File path) {
//        Map<String, Integer> fileCountByName = new HashMap<>();
//        getExtensionsCnt(path, fileCountByName);
//
//        String mostCommonExt = "";
//        int mostCommonExtCnt = 0;
//
//        for (Map.Entry<String, Integer> mapElement : fileCountByName.entrySet()) {
//            String key = mapElement.getKey();
//            int cnt = mapElement.getValue();
//            //
//      ...
//
//        }
//        return mostCommonExt;
//    }
//
//    private static void getExtensionsCnt(File path, Map<String, Integer> fileCountByName) {
//        ///
//        if (...) {
//            ///
//      ...
//        } else {
//            String ext = getExtension(path);
//            fileCountByName.put(ext, fileCountByName.getOrDefault(ext, 0) + 1);
//        }
//    }
//
//    private static String getExtension(File path) {
//        String fileName = path.getName();
//        String[] parts = fileName.split("\\.");
//        return parts[parts.length - 1];
//    }
//
//    public static void main(String[] args) {
//        File baseDirectory = new File("/root");
//        String solution = solutionInDirectory(baseDirectory);
//        System.out.println(solution);
//    }
//
//}
