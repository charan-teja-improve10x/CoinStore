package com.example.coinstore.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Coin {
    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private Boolean isNew;
    @SerializedName("is_active")
    private Boolean isActive;
    private String type;
    private String logo;
    private List<Tag> tags;
    /*{

    "team": [
        {
            "id": "satoshi-nakamoto",
            "name": "Satoshi Nakamoto",
            "position": "Founder"
        },
        {
            "id": "wladimir-j-van-der-laan",
            "name": "Wladimir J. van der Laan",
            "position": "Blockchain Developer"
        },
        {
            "id": "jonas-schnelli",
            "name": "Jonas Schnelli",
            "position": "Blockchain Developer"
        },
        {
            "id": "marco-falke",
            "name": "Marco Falke",
            "position": "Blockchain Developer"
        },
        {
            "id": "rahul",
            "name": "Rahul",
            "position": "Node js Developer"
        },
        {
            "id": "ashutosh",
            "name": "Ashutosh",
            "position": "Whale Miner"
        }
    ],
    "description": "Bitcoin is a cryptocurrency and worldwide payment system. It is the first decentralized digital currency, as the system works without a central bank or single administrator.",
    "message": "",
    "open_source": true,
    "started_at": "2009-01-03T00:00:00Z",
    "development_status": "Working product",
    "hardware_wallet": true,
    "proof_type": "Proof of Work",
    "org_structure": "Decentralized",
    "hash_algorithm": "SHA256",
    "links": {
        "explorer": [
            "https://blockchair.com/bitcoin/?from=coinpaprika",
            "https://blockchain.com/explorer",
            "https://blockstream.info/",
            "https://live.blockcypher.com/btc/",
            "https://btc.cryptoid.info/btc/"
        ],
        "facebook": [
            "https://www.facebook.com/bitcoins/"
        ],
        "reddit": [
            "https://www.reddit.com/r/bitcoin"
        ],
        "source_code": [
            "https://github.com/bitcoin/bitcoin"
        ],
        "website": [
            "https://bitcoin.org/"
        ],
        "youtube": [
            "https://www.youtube.com/watch?v=Gc2en3nHxA4&"
        ]
    },
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
    ],
    "whitepaper": {
        "link": "https://static.coinpaprika.com/storage/cdn/whitepapers/215.pdf",
        "thumbnail": "https://static.coinpaprika.com/storage/cdn/whitepapers/217.jpg"
    },
    "first_data_at": "2010-07-17T00:00:00Z",
    "last_data_at": "2023-06-21T05:22:00Z"
}*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

