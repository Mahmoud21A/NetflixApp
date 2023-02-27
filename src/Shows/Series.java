/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

/**
 *
 * @author mahmouderradi
 */
public class Series extends Show {
    private int number_of_seasons;
    private int number_of_episodes;
    

    public Series(int number_of_seasons, int number_of_episodes, String title, String quality, String genre, String lang, int num_views, String synopsys, double average_rating, String total_watch) {
        super(title, quality, genre, lang, num_views, synopsys, average_rating, total_watch);
        this.number_of_seasons = number_of_seasons;
        this.number_of_episodes = number_of_episodes;
    }

    public int getNumber_of_seasons() {
        return number_of_seasons;
    }

    public void setNumber_of_seasons(int number_of_seasons) {
        this.number_of_seasons = number_of_seasons;
    }

    public int getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(int number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of seasons: " + number_of_seasons + "\nNumber of episodes: " + number_of_episodes;
    }
    
}
