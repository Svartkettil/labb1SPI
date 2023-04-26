import org.example.service.WordTwister;

module org.example.provider {
        requires org.example.service;
        provides WordTwister with org.example.provider.TwistAllWords,
                org.example.provider.TwistSomeWords;

}