package org.lightcouch;

public class FTSQuery {
    private String designName;
    private String indexName;
    private String query;
    private String sort;
    private int limit;
    private int skip;

    public FTSQuery(String designName, String indexName, String query, String sort, int limit, int skip) {
        this.designName = designName;
        this.indexName = indexName;
        this.query = query;
        this.sort = sort;
        this.limit = limit;
        this.skip = skip;
    }

    public String getDesignName() {
        return designName;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getQuery() {
        return query;
    }

    public String getSort() {
        return sort;
    }

    public int getLimit() {
        return limit;
    }

    public int getSkip() {
        return skip;
    }
}
