using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SharePlatformVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PlatformId { get; set; }
        public string? PlatformName { get; set; }
        public string? PlatformIcon { get; set; }
        public bool? Supported { get; set; }
    }
}
