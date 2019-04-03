package com;
import java.util.*;

abstract class Item{
	private int id;
	private String title;
	private int noc;
	
	abstract public int getId();
	abstract public void setId(int id);
	
	abstract public String getTitle();
	abstract public void setTitle(String title);
	
	abstract public int getNoc();
	abstract public void setNoc(int noc);	
}

abstract class WrittenItem extends Item{
	private String author;

	abstract String getAuthor();

	abstract void setAuthor(String author);
}

class Book extends WrittenItem{
	private int id;
	private String title;
	private int noc;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println("ID : " + id);
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Number of copies : " + noc);
	}
}

class JournalPaper extends WrittenItem{
	private int id;
	private String title;
	private int noc;
	private String author;
	private int yearPub;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYearPub() {
		return yearPub;
	}
	public void setYearPub(int yearPub) {
		this.yearPub = yearPub;
	}
	
	public void display() {
		System.out.println("ID : " + id);
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Number of copies : " + noc);
		System.out.println("Year Published : " + yearPub);
	}
	
}

abstract class MediaItem extends Item{
	private int runtime;
	private int id;
	private String title;
	private int noc;
	
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearRel;
	private int runtime;
	private int id;
	private String title;
	private int noc;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearRel() {
		return yearRel;
	}
	public void setYearRel(int yearRel) {
		this.yearRel = yearRel;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public void display() {
		System.out.println("Director : " + director);
		System.out.println("Genre : " + genre);
		System.out.println("Year Released : " + yearRel);
		System.out.println("Runtime : " + runtime);
	}
	
	
}

class CD extends MediaItem{
	private String artist;
	private String genre;
	private int runtime;
	private int id;
	private String title;
	private int noc;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public void display() {
		System.out.println("Artist : " + artist);
		System.out.println("Genre : " + genre);;
		System.out.println("Runtime : " + runtime);
	}
	
	
}

public class Lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a type to Generate Collection!");
		System.out.print("1. Papers \t 2. Media : ");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.print("1. Book\t 2. JournalPapers : ");
			int choice2 = sc.nextInt();
			switch(choice2) {
			case 1:
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Number of copies : ");
				int noc = sc.nextInt();
				System.out.println("Enter Title : ");
				String title = sc.next();
				System.out.println("Enter Author name : ");
				String author = sc.next();
				
				Book b = new Book();
				b.setId(id);
				b.setAuthor(author);
				b.setNoc(noc);
				b.setTitle(title);
				
				b.display();
				
				break;
				
			case 2:
				System.out.println("Enter Id : ");
				int id1 = sc.nextInt();
				System.out.println("Enter Number of copies : ");
				int noc1 = sc.nextInt();
				System.out.println("Enter Title : ");
				String title1 = sc.next();
				System.out.println("Enter Author name : ");
				String author1 = sc.next();
				System.out.println("Enter Year Of Publish : ");
				int yop = sc.nextInt();
				
				JournalPaper p = new JournalPaper();
				p.setId(id1);
				p.setAuthor(author1);
				p.setNoc(noc1);
				p.setTitle(title1);
				p.setYearPub(yop);
				
				p.display();
				break;
				
			default:
				System.out.println("Wrong Input!");
			}
			break;
		
		case 2:
			System.out.print("1. Video\t 2. CD : ");
			int choice3 = sc.nextInt();
			switch(choice3) {
			case 1:
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Number of copies : ");
				int noc = sc.nextInt();
				System.out.println("Enter Title : ");
				String title = sc.next();
				System.out.println("Enter Director name : ");
				String director = sc.next();
				System.out.println("Genre : ");
				String genre = sc.next();
				System.out.println("Year Of release : ");
				int yearRel = sc.nextInt();
				System.out.println("Runtime : ");
				String runtime = sc.next();
				
				
				Video v = new Video();
				v.setId(id);
				v.setDirector(director);
				v.setNoc(noc);
				v.setTitle(title);
				v.setYearRel(yearRel);
				v.setGenre(genre);
				
				v.display();
				
				break;
				
			case 2:
				System.out.println("Enter Id : ");
				int id1 = sc.nextInt();
				System.out.println("Enter Number of copies : ");
				int noc1 = sc.nextInt();
				System.out.println("Enter Title : ");
				String title1 = sc.next();
				System.out.println("Enter Artist name : ");
				String artist = sc.next();
				System.out.println("Enter Year Of Publish : ");
				int yop = sc.nextInt();
				
				JournalPaper p = new JournalPaper();
				p.setId(id1);
				p.setAuthor(artist);
				p.setNoc(noc1);
				p.setTitle(title1);
				p.setYearPub(yop);
				
				p.display();
				break;
				
			default:
				System.out.println("Wrong Input!");
			}
			break;
			
		default:
			System.out.println("Wrong Input!");
		}
		
		
		sc.close();
	}

}
