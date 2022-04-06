

1.  See logger.log, why is it different from the log to console?
	Logger.log is different from log to console because if we see in logger.properties (in folder src/main/resources)
	we see that the level of file logging is defined as "All" while the level of logging on sonsole is defined as only
	the info level.(ie it is only confined to info level)
2.  Where does this line come from? FINER org.junit.jupiter.engine.execution.ConditionEvaluator logResult Evaluation of condition [org.junit.jupiter.engine.extension.DisabledCondition] resulted in: ConditionEvaluationResult [enabled = true, reason = '@Disabled is not present']
	This line is present in the logger.log file which is of the level "Finer".
3.  What does Assertions.assertThrows do?
	assertThrows assert makes sure that an exception of type TimerException.class is thrown.
4.  See TimerException and there are 3 questions
    1.  What is serialVersionUID and why do we need it? (please read on Internet)
    		which is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for 		that object that are compatible with respect to serialization. If the receiver has loaded a class for the object that has 			a different serialVersionUID than that of the corresponding sender's class, then deserialization will result in an 				InvalidClassException. 
    2.  Why do we need to override constructors?
    		
    3.  Why we did not override other Exception methods?	
1.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)
1.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)
1.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)
1.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)
1.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel) 
1.  Make a printScreen of your eclipse Maven test run, with console
1.  What category of Exceptions is TimerException and what is NullPointerException
1.  Push the updated/fixed source code to your own repository.