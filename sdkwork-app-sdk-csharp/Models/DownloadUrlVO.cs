using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DownloadUrlVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public AssetMediaResource? Resource { get; set; }
        public int? ExpiresIn { get; set; }
    }
}
