using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterListVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<CharacterItem>? Characters { get; set; }
        public int? Total { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
