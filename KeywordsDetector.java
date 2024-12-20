public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // edge case- one or more array is empty
        if (sentences.length == 0 || keywords.length == 0) {
            System.out.println("ERROR");
        }
        boolean isKeyword = false;
        for (int i = 0; i < sentences.length; i++) {
            // Initiallizing new string to be a copy of sentences[i] item,
            // in order not to change the original array values.
            String line = sentences[i].toLowerCase();
            for (int j = 0; j < keywords.length; j++) {
                // Initiallizing new string to be a copy of keywords[j] item,
                // in order not to change the original array values.
                String keywordItem = keywords[j].toLowerCase();
                if (line.indexOf(keywordItem) != -1) {
                    isKeyword = true;
                }
            }
            if (isKeyword) {
                System.out.println(sentences[i]);
                isKeyword = false;
            }
        }
    }
}
