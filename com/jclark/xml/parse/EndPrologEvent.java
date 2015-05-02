package com.jclark.xml.parse;

/**
 * Information about the prolog.
 * @see com.jclark.xml.parse.base.Application#endProlog
 * @version $Revision: 1.6 $ $Date: 1998/05/14 02:45:44 $
 */
public interface EndPrologEvent {
  /**
   * Returns the DTD.
   * This will not be null even if there was no DOCTYPE declaration.
   */
  DTD getDTD();
}
