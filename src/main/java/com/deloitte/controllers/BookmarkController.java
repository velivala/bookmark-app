package com.deloitte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

//	@Autowired
//	private BookmarkService bookmarkService;

//	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity createBookmark(@RequestBody Bookmark bookmark) {
//		Bookmark savedBookmark = bookmarkService.createBookmark(bookmark);
//		return new ResponseEntity(savedBookmark, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/{bookmarkId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity getBookmark(@PathVariable("bookmarkId") int bookmarkId) {
//		Bookmark bookmark = bookmarkService.getBookmark(bookmarkId);
//		return new ResponseEntity(bookmark, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/{bookmarkId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity deleteBookmark(
//			@PathVariable("bookmarkId") int bookmarkId) {
//		bookmarkService.deleteBookmark(bookmarkId);
//		return new ResponseEntity(HttpStatus.OK);
//	}

	@RequestMapping(value = "/{bookmarkId}", method = RequestMethod.GET)
	public ResponseEntity helloBookmark(@PathVariable String bookmarkId) {
		return new ResponseEntity(bookmarkId + " Bond - Your first bookmark is ready", HttpStatus.OK);
	}


}
