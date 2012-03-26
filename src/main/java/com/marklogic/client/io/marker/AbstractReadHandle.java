package com.marklogic.client.io.marker;

import com.marklogic.client.Format;

/**
 * A Read Handle defines a representation for reading database content.
 *
 * @param <C> the type of content received from the database when reading content; either Byte[], InputStream, File, Reader, or String
 */
public interface AbstractReadHandle<C> {
	public Format getFormat();
	public void setFormat(Format format);

	/**
	 * Declares the class of the content received from the database.  This method
	 * is part of the contract between a read handle and the API.  You should rarely
	 * if ever need to call this method directly when using the handle.
	 * @return
	 */
	public Class<C> receiveAs();
	/**
	 * Receives content from the database.  This method is part of the contract
	 * between a read handle and the API.  You should rarely
	 * if ever need to call this method directly when using the handle.
	 * @return
	 */
	public void receiveContent(C content);
}
