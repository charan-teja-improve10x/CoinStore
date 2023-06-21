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
    @SerializedName("team")
    private List<Team> teams;
    private String description;
    private String message;
    @SerializedName("open_source")
    private Boolean openSource;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("development_status")
    private String developmentStatus;
    @SerializedName("hardware_wallet")
    private Boolean hardwareWallet;
    @SerializedName("proof_type")
    private String proofType;
    @SerializedName("org_structure")
    private String orgStructure;
    @SerializedName("hash_algorithm")
    private String hashAlgorithm;
    private List<Link> links;
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

