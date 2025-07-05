package org.example.studyplanner;

public class HabitCreationData {
    private String name;
    private String motivation;
    private Integer dailyMinutesDedication;
    private Integer dailyHoursDedication;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer seconds;
    private Boolean isConcluded;

    // Constructor
    public HabitCreationData(String name, String motivation, Integer dailyMinutesDedication,
                             Integer dailyHoursDedication, Integer year, Integer month, Integer day,
                             Integer hour, Integer minute, Integer seconds, Boolean isConcluded) {
        this.name = name;
        this.motivation = motivation;
        this.dailyMinutesDedication = dailyMinutesDedication;
        this.dailyHoursDedication = dailyHoursDedication;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
        this.isConcluded = isConcluded;
    }

    // Getters
    public String getName() { return name; }
    public String getMotivation() { return motivation; }
    public Integer getDailyMinutesDedication() { return dailyMinutesDedication; }
    public Integer getDailyHoursDedication() { return dailyHoursDedication; }
    public Integer getYear() { return year; }
    public Integer getMonth() { return month; }
    public Integer getDay() { return day; }
    public Integer getHour() { return hour; }
    public Integer getMinute() { return minute; }
    public Integer getSeconds() { return seconds; }
    public Boolean getIsConcluded() { return isConcluded; }
}
