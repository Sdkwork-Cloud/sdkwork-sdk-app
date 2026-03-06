package types


type TreeNodePath struct {
	Nodes []PathNode `json:"nodes"`
	Level int `json:"level"`
	Depth int `json:"depth"`
	PathIds []int `json:"pathIds"`
	PathName string `json:"pathName"`
	ParentNode PathNode `json:"parentNode"`
	RootNode PathNode `json:"rootNode"`
	CurrentNode PathNode `json:"currentNode"`
}
