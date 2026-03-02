using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AssetSearchResult
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? Path { get; set; }
        public string? WorkspaceId { get; set; }
    }
}
