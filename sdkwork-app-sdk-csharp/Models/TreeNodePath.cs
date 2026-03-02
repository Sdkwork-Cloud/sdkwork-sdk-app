using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TreeNodePath
    {
        public List<PathNode>? Nodes { get; set; }
        public int? Level { get; set; }
        public int? Depth { get; set; }
        public string? PathName { get; set; }
        public PathNode? RootNode { get; set; }
        public PathNode? ParentNode { get; set; }
        public List<int>? PathIds { get; set; }
        public PathNode? CurrentNode { get; set; }
    }
}
