using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BlockCheckVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? IsBlocked { get; set; }
        public string? BlockTime { get; set; }
        public string? BlockReason { get; set; }
    }
}
