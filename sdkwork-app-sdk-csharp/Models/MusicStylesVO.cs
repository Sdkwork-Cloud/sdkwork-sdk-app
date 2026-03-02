using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicStylesVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<GenreVO>? Genres { get; set; }
        public List<StyleVO>? Styles { get; set; }
        public List<MoodVO>? Moods { get; set; }
        public List<InstrumentVO>? Instruments { get; set; }
    }
}
