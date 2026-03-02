package com.sdkwork.app.model;

public class TreeNodePath {
    private List<PathNode> nodes;
    private Integer level;
    private Integer depth;
    private String pathName;
    private PathNode rootNode;
    private PathNode parentNode;
    private List<Integer> pathIds;
    private PathNode currentNode;

    public List<PathNode> getNodes() {
        return this.nodes;
    }
    
    public void setNodes(List<PathNode> nodes) {
        this.nodes = nodes;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDepth() {
        return this.depth;
    }
    
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getPathName() {
        return this.pathName;
    }
    
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public PathNode getRootNode() {
        return this.rootNode;
    }
    
    public void setRootNode(PathNode rootNode) {
        this.rootNode = rootNode;
    }

    public PathNode getParentNode() {
        return this.parentNode;
    }
    
    public void setParentNode(PathNode parentNode) {
        this.parentNode = parentNode;
    }

    public List<Integer> getPathIds() {
        return this.pathIds;
    }
    
    public void setPathIds(List<Integer> pathIds) {
        this.pathIds = pathIds;
    }

    public PathNode getCurrentNode() {
        return this.currentNode;
    }
    
    public void setCurrentNode(PathNode currentNode) {
        this.currentNode = currentNode;
    }
}
