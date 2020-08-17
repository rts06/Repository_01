node {
   stage 'Run JMeter Test'
   bat 'D:/apache-jmeter-5.3/bin/jmeter.bat -n -t D:/apache-jmeter-5.3/Scripts/Test01.jmx -l D:/apache-jmeter-5.3/Scripts/Test01.jtl'
}