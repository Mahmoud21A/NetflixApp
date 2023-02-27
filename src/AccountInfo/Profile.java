/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountInfo;
import Shows.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author mahmouderradi
 */
public class Profile {
    
    private String name;
    private MaturityLevel Level_restriction;
    private String email;
    private boolean toNotify;
    private Language language;
    private Playback playback;
    private boolean subtitles;
    private List <Show> favorites;
    private List <Show> blocked;
    private Language subtitles_lang;
    
    public Profile(String name, int min_age, String description, String email, boolean toNotify, String lang, Playback playback, boolean subtitles, List<Show> favorites, List<Show> blocked, String subtitles_lang) {
        this.name = name;
        this.Level_restriction = new MaturityLevel(min_age, description);
        this.email = email;
        this.toNotify = toNotify;
        setLanguage(lang);
        this.playback = playback;
        this.subtitles = subtitles;
        favorites = new ArrayList<>();
        blocked = new ArrayList<>();
        setSubtitles_lang(subtitles_lang);
    }

    public String getName() {
        return name;
    }

    public MaturityLevel getLevel_restriction() {
        return Level_restriction;
    }

    public String getEmail() {
        return email;
    }

    public boolean isToNotify() {
        return toNotify;
    }

    public Language getLanguage() {
        return language;
    }

    public Playback getPlayback() {
        return playback;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public ListIterator<Show> getFavorites() {
        return favorites.listIterator();
    }

    public ListIterator<Show> getBlocked() {
        return blocked.listIterator();
    }

    public Language getSubtitles_lang() {
        return subtitles_lang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel_restriction(MaturityLevel Level_restriction) {
        this.Level_restriction = Level_restriction;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public void setLanguage(String lang) {
        if(lang.equalsIgnoreCase(Language.ENGLISH.name()) || lang.equalsIgnoreCase(Language.FRENCH.name()) || lang.equalsIgnoreCase(Language.SPANISH.name())){
            lang = lang.toUpperCase();
            this.language = Language.valueOf(lang);
        }
    }

    public void setPlayback(Playback playback) {
        this.playback = playback;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public void setFavorites(Show favoriteShow) {
        favorites.add(favoriteShow);
    }

    public void setBlocked(Show blockedShow) {
        blocked.add(blockedShow);
    }

    public void setSubtitles_lang(String lang) {
        if(lang.equalsIgnoreCase(Language.ENGLISH.name()) || lang.equalsIgnoreCase(Language.FRENCH.name()) || lang.equalsIgnoreCase(Language.SPANISH.name())){
            lang = lang.toUpperCase();
            this.subtitles_lang = Language.valueOf(lang);
        }
    }
    
    public boolean add_favorite(Show show){
        return favorites.add(show);
    }
  
    public String toString() {
        return name + " " + Level_restriction + " " + email + " " + toNotify + " " + language + " " + playback + " " + subtitles + " " + favorites + " " + blocked + " " + subtitles_lang;
    }  
    
}
