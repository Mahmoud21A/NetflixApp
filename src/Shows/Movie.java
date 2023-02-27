/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

/**
 *
 * @author mahmouderradi
 */
public class Movie extends Show{
    String duration;

    public Movie(String duration, String title, String quality, String genre, String lang, int num_views, String synopsys, double average_rating, String total_watch) {
        super(title, quality, genre, lang, num_views, synopsys, average_rating, total_watch);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + "Duration: " + duration;
    }

}
