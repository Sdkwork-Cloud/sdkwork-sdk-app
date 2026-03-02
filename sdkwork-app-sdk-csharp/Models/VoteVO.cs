using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoteVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? VoteId { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Rating { get; set; }
    }
}
