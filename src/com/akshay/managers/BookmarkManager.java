package com.akshay.managers;

import com.akshay.entities.Book;
import com.akshay.entities.Movie;
import com.akshay.entities.WebLink;

public class BookmarkManager {

	private static BookmarkManager instance=new BookmarkManager();
	private BookmarkManager() {}
	public static BookmarkManager getInstance() {
		return instance;
	}
	public Movie createMovie(long id,String title,String profileUrl,int releaseYear,
			String[] cast,String[] directors,String genre,double imdbRating) {
		Movie movie=new Movie();
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setId(id);
		movie.setImdbRating(imdbRating);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setTitle(title);
		return movie;
	}
	
	public Book createBook(long id,String title,int publicationYear,String publisher,String[] authors,String genre,double amazonRating) {
		Book book=new Book();
		book.setAmazonRating(amazonRating);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setId(id);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setTitle(title);
		return book;
	}
	
	public WebLink createWebLink(long id,String title,String url,String host) {
		WebLink webLink=new WebLink();
		webLink.setUrl(url);
		webLink.setId(id);
		webLink.setTitle(title);
		webLink.setHost(host);
		return webLink;
	}
}
