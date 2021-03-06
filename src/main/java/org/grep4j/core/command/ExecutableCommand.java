package org.grep4j.core.command;

/**
 * Base interface all the Linux Command have to implement so to be executable.
 * 
 * @author Giovanni Gargiulo
 * @author Marco Castigliego
 */
public interface ExecutableCommand {

	/**
	 * @return the String format of the command to be executed.
	 */
	String getCommandToExecute();

}
