package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int avgScore = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                avgScore += subject.score();
                count++;
            }
        }
        return avgScore == 0 ? 0 : (double) avgScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new LinkedList<>();
        for (Pupil pupil : pupils) {
            int avgScore = 0;
            for (Subject subject : pupil.subjects()) {
                avgScore += subject.score();
            }
            list.add(new Label(pupil.name(), ((double) avgScore / pupil.subjects().size())));
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new LinkedList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> sub : map.entrySet()) {
            list.add(new Label(sub.getKey(), ((double) sub.getValue() / pupils.size())));
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> averageScoresPupil = averageScoreByPupil(pupils);
        Label topPup = Collections.max(averageScoresPupil);
        return topPup;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> averageScoreBySubject = averageScoreBySubject(pupils);
        Label topSub = Collections.max(averageScoreBySubject);
        return topSub;
    }
}