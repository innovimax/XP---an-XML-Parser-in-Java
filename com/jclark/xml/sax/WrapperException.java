package com.jclark.xml.sax;

import org.xml.sax.SAXException;

/**
 * A wrapper around an EntityResolver generated exception.
 *
 * @see Driver
 * @version $Revision: 1.4 $ $Date: 1998/05/14 01:42:20 $
 */
class WrapperException extends java.io.IOException {
  SAXException wrapped;
  WrapperException(SAXException e) {
    wrapped = e;
  }
  SAXException getWrapped() {
    return wrapped;
  }
}

