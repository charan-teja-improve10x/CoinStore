package com.example.coinstore.model;

public class LinkExtended {
    private String url;
    private String type;
    private Stats stats;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
/*
    "links_extended": [
        {
            "url": "https://bitcoin.org/en/blog",
            "type": "blog"
        },
        {
            "url": "https://blockchair.com/bitcoin/?from=coinpaprika",
            "type": "explorer"
        },
        {
            "url": "https://blockchain.com/explorer",
            "type": "explorer"
        },
        {
            "url": "https://blockstream.info/",
            "type": "explorer"
        },
        {
            "url": "https://live.blockcypher.com/btc/",
            "type": "explorer"
        },
        {
            "url": "https://btc.cryptoid.info/btc/",
            "type": "explorer"
        },
        {
            "url": "https://www.facebook.com/bitcoins/",
            "type": "facebook"
        },
        {
            "url": "https://bitcointalk.org",
            "type": "message_board"
        },
        {
            "url": "https://www.reddit.com/r/bitcoin",
            "type": "reddit",
            "stats": {
                "subscribers": 5604728
            }
        },
        {
            "url": "https://github.com/bitcoin/bitcoin",
            "type": "source_code",
            "stats": {
                "contributors": 1141,
                "stars": 70021
            }
        },
        {
            "url": "https://twitter.com/bitcoincoreorg",
            "type": "twitter",
            "stats": {
                "followers": 161310
            }
        },
        {
            "url": "https://electrum.org/#download",
            "type": "wallet"
        },
        {
            "url": "https://bitcoin.org/",
            "type": "website"
        },
        {
            "url": "https://www.youtube.com/watch?v=Gc2en3nHxA4&",
            "type": "youtube"
        }
   */