package com.example.coinstore.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Link {
    @SerializedName("explorer")
    private List<String> explorers;
    @SerializedName("facebook")
    private List<String> facebooks;
    @SerializedName("reddit")
    private List<String> reddits;
    @SerializedName("source_code")
    private List<String> sourceCodes;
    @SerializedName("website")
    private List<String> websites;
    @SerializedName("youtube")
    private List<String> youtubes;

    public List<String> getExplorers() {
        return explorers;
    }

    public void setExplorers(List<String> explorers) {
        this.explorers = explorers;
    }

    public List<String> getFacebooks() {
        return facebooks;
    }

    public void setFacebooks(List<String> facebooks) {
        this.facebooks = facebooks;
    }

    public List<String> getReddits() {
        return reddits;
    }

    public void setReddits(List<String> reddits) {
        this.reddits = reddits;
    }

    public List<String> getSourceCodes() {
        return sourceCodes;
    }

    public void setSourceCodes(List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
    }

    public List<String> getWebsites() {
        return websites;
    }

    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    public List<String> getYoutubes() {
        return youtubes;
    }

    public void setYoutubes(List<String> youtubes) {
        this.youtubes = youtubes;
    }
}
// "links": {
//         "explorer": [
//         "https://blockchair.com/bitcoin/?from=coinpaprika",
//         "https://blockchain.com/explorer",
//         "https://blockstream.info/",
//         "https://live.blockcypher.com/btc/",
//         "https://btc.cryptoid.info/btc/"
//         ],
//         "facebook": [
//         "https://www.facebook.com/bitcoins/"
//         ],
//         "reddit": [
//         "https://www.reddit.com/r/bitcoin"
//         ],
//         "source_code": [
//         "https://github.com/bitcoin/bitcoin"
//         ],
//         "website": [
//         "https://bitcoin.org/"
//         ],
//         "youtube": [
//         "https://www.youtube.com/watch?v=Gc2en3nHxA4&"
//         ]
//         },